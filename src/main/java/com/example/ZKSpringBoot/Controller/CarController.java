package com.example.ZKSpringBoot.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.EventListener;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Rows;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.example.ZKSpringBoot.Service.CarDispatchApplicationService;
import com.example.ZKSpringBoot.model.bo.CarDispatchApplicationBO;
import com.example.ZKSpringBoot.pojo.CarDispatchApplication;
import com.example.ZKSpringBoot.utils.BaseUtils;

import io.micrometer.common.util.StringUtils;

@Controller("CarController")
public class CarController extends SelectorComposer<Component> {

	private static final long serialVersionUID = 1L;

	@Wire
	private Grid carRequestGrid;

	@Wire
	private Rows carRequestRows;
	
	@Wire
	private Listbox carDispatchApplicationlist;
	
	@Wire
	private Textbox textUser;
	
	@Wire
	private Textbox textAppNo;
	
	@Wire
	private Button updateBtn;
	
	@Wire
	private Button deleteBtn;
	

	
	@Autowired
	private CarDispatchApplicationService carDispatchApplicationService;
	

	
	
	private CarDispatchApplication carDispatchApplication;
	
	

	@Listen("onClick = #createBtn")
	public void openCreateWindow() {
		// create a window programmatically and use it as a modal dialog.
		Window window = (Window) Executions.createComponents("~./views/create_dialog.zul", null, null);
		window.doModal();
	}
	
	@Listen("onClick = #search")
	public void getAllData() {
		List<CarDispatchApplicationBO> carDispatchApplicationBOList = new ArrayList<>();
		
		if(StringUtils.isNotBlank(textUser.getValue())) {
			carDispatchApplicationBOList= carDispatchApplicationService.findByUserName(textUser.getValue());
			
			 
		}else if(StringUtils.isNotBlank(textAppNo.getValue())) {
			CarDispatchApplicationBO carDispatchApplicationBO = new CarDispatchApplicationBO();
			 carDispatchApplicationBO= carDispatchApplicationService.findByAppNo(textAppNo.getValue());
			 carDispatchApplicationBOList.add(carDispatchApplicationBO);
		}else {
			
			 carDispatchApplicationBOList= carDispatchApplicationService.findAll();
		}
		
		carDispatchApplicationlist.setModel(new ListModelList<CarDispatchApplicationBO>(carDispatchApplicationBOList) );

	}
	
	private Button createButton(String label, String icon, EventListener<Event> listener) {
	    Button button = new Button(label);
	    button.setIconSclass(icon);
	    button.addEventListener("onClick", listener);
	    return button;
	}
	
	
	@Listen("onSelect = listbox")
	public void getCarDispatchApplicationlist() throws NumberFormatException, Exception {
		 updateBtn.setDisabled(false);
		 deleteBtn.setDisabled(false);
		 Listitem selectedItem = carDispatchApplicationlist.getSelectedItem();
		 
		  if (selectedItem != null) {
	            // 取得所有 listcell
	            List<Listcell> cells = selectedItem.getChildren();

	            // 取得 appNo (第一個 listcell)
	            String appID = cells.get(1).getLabel();
	            
	            CarDispatchApplicationBO carDispatchApplicationBO=carDispatchApplicationService.findById(Long.parseLong(appID));
	            this.carDispatchApplication = BaseUtils.copyProperties(carDispatchApplicationBO, CarDispatchApplication::new);
		  }
		
	}
	
	@Listen("onClick=#deleteBtn")
	public void DeleteSelection(Event event) {
		carDispatchApplicationService.isdelete(carDispatchApplication);
		
		//重新查詢全部資料
		List<CarDispatchApplicationBO> carDispatchApplicationBOList = carDispatchApplicationService.findAll();
		//塞回前端資料
		carDispatchApplicationlist.setModel(new ListModelList<CarDispatchApplicationBO>(carDispatchApplicationBOList) );

	}
	
	@Listen("onClick=#updateBtn")
	public void UpdateSelection() {
		Map<String , Object> params = new HashMap<>();
		params.put("car", this.carDispatchApplication);
		Window window = (Window) Executions.createComponents("~./views/create_dialog.zul", null, params);
		window.doModal();
	}
	
	
	
//	@Listen("onCheck=#carListbox")
//	public void toggleSelection(Event event, @BindingParam("appID") String appID) {
//	    Checkbox checkbox = (Checkbox) event.getTarget();
//
//	    if (checkbox.isChecked()) {
//	        selectedIds.add(appID);
//	    } else {
//	        selectedIds.remove(appID);
//	    }
//	}
	
//	  @Listen("onCheck = checkbox")
//	    public void handleCheckbox(Event event) {
//	        Checkbox checkbox = (Checkbox) event.getTarget();
//	        String appID = checkbox.getAttribute("data-id").toString(); // 取得 ID
//	        boolean isChecked = checkbox.isChecked(); // 判斷是否被選取
//	        
//	        System.out.println("選擇的 ID：" + appID + "，狀態：" + isChecked);
//
//	        // 這裡可以進一步處理，例如傳給後端儲存選取狀態
//	    }

}

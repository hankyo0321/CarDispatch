package com.example.ZKSpringBoot.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Checkbox;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.example.ZKSpringBoot.Service.CarDispatchApplicationService;
import com.example.ZKSpringBoot.model.bo.CarDispatchApplicationBO;

import io.micrometer.common.util.StringUtils;

@Controller("CarDispatchController")
public class CarDispatchController extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	private Textbox userName;
	@Wire
	private Datebox appDate;
	@Wire
	private Radiogroup useType;
	@Wire
	private Datebox expecedDateFm;
	@Wire
	private Datebox expecedDateTo;
	@Wire
	private Textbox deptID;
	@Wire
	private Radiogroup carLevel;
	@Wire
	private Textbox carTypeID;

	@Wire
	private Intbox numberOfPeole;

	@Wire
	private Textbox companions;

	@Wire
	private Textbox destination;

	@Wire
	private Textbox reason;

	@Wire
	private Textbox waitingPlace;

	@Wire
	Window modalDialog;
	
	@Wire
	private Listbox carListbox;

	@Wire
	private Radiogroup transmissionRadiogroup;

	@Autowired
	private CarDispatchApplicationService carDispatchApplicationService;

	@Listen("onClick= #submit")
	public void CarApplication() throws Exception {
	

		String userValue = userName.getValue();
		Date appDateValue= appDate.getValue();
		Date expecedDateFmValue = expecedDateFm.getValue();
		Date expecedDateToValue = expecedDateTo.getValue();
		String useTypeValue=useType.getSelectedItem().getValue();
		String deptIDValue = deptID.getValue();
		String carLevelValue=carLevel.getSelectedItem().getValue();
		String carTypeIDValue = carTypeID.getValue();
		Integer numberOfPeoleValue = numberOfPeole.getValue();
		String companionsValue= companions.getValue();
		String destinationValue = destination.getValue();
		String reasonValue = reason.getValue();
		String waitingPlaceValue = waitingPlace.getValue();
		CarDispatchApplicationBO carDispatchApplication = new CarDispatchApplicationBO(
				appDateValue,useTypeValue
				,expecedDateFmValue,expecedDateToValue
				,deptIDValue,carLevelValue,carTypeIDValue
				,userValue,numberOfPeoleValue
				,companionsValue,destinationValue,
				reasonValue,waitingPlaceValue);
		if (StringUtils.isBlank(userValue)) {
			System.out.println("不可以為空");
		}
		
		CarDispatchApplicationBO carDispatchApplicationBO = carDispatchApplicationService.save(carDispatchApplication);
		if(carDispatchApplicationBO!=null) {
			Clients.showNotification("儲存成功！", Clients.NOTIFICATION_TYPE_INFO, null, "middle_center", 3000);
		}else {
			 Clients.showNotification("儲存失敗，請重試！", Clients.NOTIFICATION_TYPE_ERROR, null, "middle_center", 3000);
		}
		modalDialog.detach();
	}

	@Listen("onClick = #cancel")
	public void closeWindowDialog(Event e) {
		modalDialog.detach();

	}
	
	

}

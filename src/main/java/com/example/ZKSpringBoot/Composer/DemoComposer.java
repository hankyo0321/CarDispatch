//package com.example.ZKSpringBoot.Composer;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.zkoss.zk.ui.select.SelectorComposer;
//import org.zkoss.zk.ui.select.annotation.Listen;
//import org.zkoss.zk.ui.select.annotation.Wire;
//import org.zkoss.zk.ui.select.annotation.WireVariable;
//import org.zkoss.zul.Image;
//import org.zkoss.zul.Label;
//import org.zkoss.zul.ListModelList;
//import org.zkoss.zul.Listbox;
//import org.zkoss.zul.Textbox;
//import org.zkoss.zul.Window;
//
//import com.example.ZKSpringBoot.Service.CarService;
//import com.example.ZKSpringBoot.pojo.Car;
//
//@SuppressWarnings("serial")
//@Controller
//@Scope("prototype")
//public class DemoComposer extends SelectorComposer<Window> {
//	
//	@Autowired
//    CarService carService;
//	
//	@Wire
//	private Textbox keywordBox;
//	
//	@Wire
//	private Listbox carListbox;
//	
//	
//	@Wire
//	private Label modelLabel;
//	@Wire
//	private Label makeLabel;
//	@Wire
//	private Label priceLabel;
//	@Wire
//	private Label descriptionLabel;
//	@Wire
//	private Image previewImage;
//	
//	
//	
//	@Listen("onClick = #searchButton")
//	public void search() {
//		String keyword = keywordBox.getValue();
//		carListbox.clearSelection();
//		System.out.println(keyword);
//		
//		List<Car> result = carService.getCarByMake(keyword);
//		
//		carListbox.setModel(new ListModelList<Car>(result));
//
//	}
//	
//	
//	@Listen("onSelect = #carListbox")
//	public void showDetail(){
//		Car selected = carListbox.getSelectedItem().getValue();
//		previewImage.setSrc(selected.getPreview());
//		modelLabel.setValue(selected.getModel());
//		makeLabel.setValue(selected.getMake());
//		priceLabel.setValue(selected.getPrice().toString());
//		descriptionLabel.setValue(selected.getDescription());
//	}
//	
//
//}

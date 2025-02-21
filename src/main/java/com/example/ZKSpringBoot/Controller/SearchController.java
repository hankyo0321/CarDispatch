//package com.example.ZKSpringBoot.Controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.zkoss.zk.ui.Component;
//import org.zkoss.zk.ui.select.SelectorComposer;
//import org.zkoss.zk.ui.select.annotation.Listen;
//import org.zkoss.zk.ui.select.annotation.Wire;
//import org.zkoss.zul.Image;
//import org.zkoss.zul.Label;
//import org.zkoss.zul.ListModelList;
//import org.zkoss.zul.Listbox;
//import org.zkoss.zul.Textbox;
//
//import com.example.ZKSpringBoot.Service.CarService;
//import com.example.ZKSpringBoot.pojo.Car;
//
//
//@Controller("SearchController")
//public class SearchController extends SelectorComposer<Component> {
//	
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
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
////	@WireVariable
////	CarService carservice;
//	
//	@Autowired
//	private CarService carservice;
//	
//	
//	
//	@Listen("onClick = #searchButton")
//	public void search() {
//		String keyword = keywordBox.getValue();
//		System.out.println(keyword);
//		
//		List<Car> result = carservice.getCarByMake(keyword);
//		
//		carListbox.setModel(new ListModelList<Car>(result));
//
//	}
//	
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
//}
package com.example.ZKSpringBoot.ViewModel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zul.ListModelList;

import com.example.ZKSpringBoot.Service.CarDispatchApplicationService;
import com.example.ZKSpringBoot.model.bo.CarDispatchApplicationBO;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class CarDispatchViewModel {
	
	@Autowired
	private CarDispatchApplicationService carDispatchService;
	
	private ListModelList<CarDispatchApplicationBO> carDispatchApplicationlist = new ListModelList<>();
	
	
	@Command
	@NotifyChange("carDispatchApplicationlist")
	public void loadCarRequests() {
	    List<CarDispatchApplicationBO> requests = carDispatchService.findAll(); // 從 API 獲取資料
	    this.carDispatchApplicationlist = new ListModelList<>(requests);
	}

}

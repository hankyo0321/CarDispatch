package com.example.ZKSpringBoot.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.example.ZKSpringBoot.pojo.CarDispatchApplication;

@Controller("UpdateCarController")
public class UpdateCarController extends SelectorComposer<Window> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Wire
	private Textbox applyUser;

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
	private Textbox userName;
	
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
	

	

    @Override
    public void doAfterCompose(Window comp) throws Exception {
        super.doAfterCompose(comp);
        
        Map<String, Object> args = (Map<String, Object>) Executions.getCurrent().getArg();
        
        CarDispatchApplication CarDispatchApplicationPO = (CarDispatchApplication) args.get("car");
    }
}

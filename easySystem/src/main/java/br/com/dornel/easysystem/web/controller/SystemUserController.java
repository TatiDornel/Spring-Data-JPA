package br.com.dornel.easysystem.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import br.com.dornel.easysystem.entity.SystemUser;
import br.com.dornel.easysystem.service.SystemUserService;

@Controller
@RequestMapping("systemuser")
public class SystemUserController {

	@Autowired
	private SystemUserService serviceSystemUser;
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("systemuser") SystemUser entitySystemUser,
			@RequestParam(value = "file", required = false) MultipartFile file){
		try {
			entitySystemUser.setPhoto(file.getBytes());
			serviceSystemUser.save(entitySystemUser); 
			return "sucess";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "error";
		}
		
	}
//	return "redirect:/usuario/perfil/" + usuario.getId();
	@RequestMapping(value="/add", method = RequestMethod.GET)
	public ModelAndView showForm(@ModelAttribute("systemuser") SystemUser entitySystemUser
			 ){
		
		return new ModelAndView("systemuser/register"); 

	}
	
	
}

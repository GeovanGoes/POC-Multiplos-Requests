/**
 * 
 */
package br.com.pocs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author geovan.goes
 *
 */
@Controller
@RequestMapping(value = "/terceiro-contador/*")
public class TerceiroContadorController
{
	@GetMapping(value = "ate-um")
	public String contaAteUm(Model model)
	{
		model.addAttribute("milis", 1000);
		return "conta";
	}
	
	@GetMapping(value = "ate-dez")
	public String contaAteDez(Model model)
	{
		model.addAttribute("milis", 10000);
		return "conta";
	}
}

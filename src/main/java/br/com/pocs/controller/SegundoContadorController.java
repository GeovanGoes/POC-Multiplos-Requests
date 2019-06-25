/**
 * 
 */
package br.com.pocs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author geovan.goes
 *
 */
@Controller
@RequestMapping(value = "/segundo-contador/*")
public class SegundoContadorController
{
	@GetMapping(value = "ate-um")
	public String contaAteUm()
	{
		return "conta-ate-um";
	}
	
	@GetMapping(value = "ate-dez")
	public String contaAteDez()
	{
		return "conta-ate-dez";
	}
}

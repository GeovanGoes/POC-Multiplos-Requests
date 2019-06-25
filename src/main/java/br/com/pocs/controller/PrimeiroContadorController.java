/**
 * 
 */
package br.com.pocs.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author geovan.goes
 *
 */
@RestController
@RequestMapping(value = "/primeiro-contador")
public class PrimeiroContadorController
{

	@RequestMapping(value = "/ate-um", method = RequestMethod.GET)
	public String contaAteUm()
	{
		return conta(1000);
	}
	
	/***
	 * 
	 * @param milis
	 * @return
	 */
	private String conta(long milis)
	{
		try
		{
			Date inicio = new Date();
			Thread.sleep(milis);
			String result = "comecei a contar as " + inicio + "\ncontei ate " + milis / 1000 + "\nacabei de contar as " + new Date();
			return result;
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
			return "deu ruim...";
		}
	}
	
	@RequestMapping(value = "/ate-dez", method = RequestMethod.GET)
	public String contaAteDez()
	{
		return conta(10000);
	}
}

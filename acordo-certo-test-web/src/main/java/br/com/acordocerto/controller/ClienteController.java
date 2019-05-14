
package br.com.acordocerto.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.com.acordocerto.model.Cliente;
import br.com.acordocerto.services.ClienteService;

@Controller
@RequestMapping("cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ModelAndView cliente() {
		ModelAndView modelAndView = new ModelAndView("cliente");
		modelAndView.addObject("clientes", clienteService.returnClientes());
		modelAndView.addObject("roles", clienteService.returnRoles());
		return modelAndView;
	}
	
	@RequestMapping(value = "cadastrar", method = RequestMethod.POST)
	public ModelAndView cadastrar(@RequestParam("email") String email, @RequestParam("nome") String nome,
			@RequestParam("sobrenome") String sobrenome, @RequestParam("dataNascimento") String dataNascimento,
			@RequestParam("roles") String role, HttpServletRequest status) {
		
		boolean st = false;
		
		if(status.getParameter("active") != null)
			st = true;
		
		clienteService.cadastraCliente(new Cliente(email, nome, sobrenome, dataNascimento, role, st));
		return cliente();
	}

}

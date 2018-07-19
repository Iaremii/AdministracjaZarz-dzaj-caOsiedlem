package systemDemo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import systemDemo.entity.Osoba;
import systemDemo.entity.PracaDomowa;
import systemDemo.entity.Zamowienie;
import systemDemo.service.ZamowienieService;

@Controller
@RequestMapping("/zamowienie")
public class ZamowienieController {

	@Autowired
	private ZamowienieService zamowienieService;

	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@GetMapping("/list")
	public String listaZamowien(Model theModel) {

		List<Zamowienie> list = zamowienieService.getListaZamowien();
		theModel.addAttribute("lista", list);
		return "listaZamowien";
	}

	@GetMapping("/showFormForAdd")
	public String showFormForAdd(@RequestParam("PracaId") int theId, @RequestParam("OsobaId") int theId2,
			Model theModel) {

		Zamowienie zamowienie = new Zamowienie();
		theModel.addAttribute("pracaId", theId);
		theModel.addAttribute("osobaId", theId2);
		theModel.addAttribute("zamowienie", zamowienie);
		return "zamowienie-form";
	}

	@GetMapping("/showWorks")
	public String showWorks(Model theModel) {

		List<PracaDomowa> list = zamowienieService.getListaPrac();
		theModel.addAttribute("lista", list);
		return "listaPrac";
	}

	@GetMapping("/showKlients")
	public String showKlients(@RequestParam("PracaId") int id, Model theModel) {

		List<Osoba> list = zamowienieService.getListaMieszkancow();
		theModel.addAttribute("id", id);
		theModel.addAttribute("lista", list);
		return "listaMieszkancow";
	}

	@RequestMapping(value = "/saveZamowienie", method = RequestMethod.POST)
	public String saveZamowienie(@Valid @ModelAttribute("zamowienie") Zamowienie noweZamowienie,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "zamowienie-form";
		} else {

			zamowienieService.saveZamowienie(noweZamowienie);
			return "redirect:/zamowienie/list";
		}

	}

	@GetMapping("/delete")
	public String deleteZamowienie(@RequestParam("zamowienieId") int id) {
		zamowienieService.deleteZamowienie(id);
		return "redirect:/zamowienie/list";

	}

	@GetMapping("/stworzenieKlienta")
	public String showFromForCreate(Model theModel) {
		Osoba osoba = new Osoba();
		theModel.addAttribute("osoba", osoba);
		return "klient-form";
	}

	@PostMapping("/saveOsoba")
	public String saveOsoba(@Valid @ModelAttribute("osoba") Osoba nowaOsoba, BindingResult theBindingResult) {

		if (theBindingResult.hasErrors()) {
			return "klient-form";
		} else {
			zamowienieService.saveUser(nowaOsoba);
			return "redirect:/zamowienie/showKlients?PracaId=2";
		}

	}

	@GetMapping("/listaZamowienKlienta")
	public String listaZamowienKlienta(@RequestParam("OsobaId") int id, Model theModel) {

		List<Zamowienie> zamowienie = zamowienieService.showZamowieniaKlienta(id);

		theModel.addAttribute("zamowienie", zamowienie);
		theModel.addAttribute("id", id);

		return "listaZamowienKlienta";
	}
}

package tacos.web;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;
import tacos.Taco;
import tacos.Ingredient;
import tacos.Ingredient.Type;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

	@GetMapping
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(
				new Ingredient("FLTO", "wheat", Type.WRAP),
				new Ingredient("COTO", "maize", Type.WRAP),
				new Ingredient("GRBF", "ground beef", Type.PROTEIN),
				new Ingredient("CARN", "meat pieces", Type.PROTEIN),
				new Ingredient("TMTO", "diced tomatoes", Type.VEGGIES),
				new Ingredient("LETC", "lettuce", Type.VEGGIES),
				new Ingredient("CHED", "cheddar", Type.CHEESE),
				new Ingredient("JACK", "Monterey Jack", Type.CHEESE),
				new Ingredient("SLSA", "salsa", Type.SAUCE),
				new Ingredient("SRCR", "sour cream", Type.SAUCE)
				);
		
		Type[] types = Ingredient.Type.values();
		for (Type type : types) {
			model.addAttribute(type.toString().toLowerCase(), filterByType(ingredients, type));
		}
		model.addAttribute("design", new Taco());
		return "design";
	}
	
	@PostMapping
	public String processDesign(Design design) {
		log.info("Processing taco: " + design);
		return "redirect:/orders/current";
	}
}

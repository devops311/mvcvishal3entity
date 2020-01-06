package com.mindtree.vehiclebrands.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindtree.vehiclebrands.entity.Bike;
import com.mindtree.vehiclebrands.entity.Brand;
import com.mindtree.vehiclebrands.entity.Dealer;
import com.mindtree.vehiclebrands.exception.ServiceException;
import com.mindtree.vehiclebrands.service.BikeService;
import com.mindtree.vehiclebrands.service.BrandService;
import com.mindtree.vehiclebrands.service.DealerService;

@Controller
public class VehicleBrandsController {
	@Autowired
	BrandService brandService;
	@Autowired
	BikeService bikeService;
	@Autowired
	DealerService dealerService;
//@RequestParam String bikeName,@RequestParam String brandName

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("assign")
	public String getdealerandbrandlist(Model model) {
		List<Dealer> dealers = dealerService.getAlldealers();
		model.addAttribute("dealer", dealers);
		List<Brand> brands = brandService.getAllbrands();
		model.addAttribute("brand", brands);
		return "assign";
	}

	@RequestMapping("/assigndealerTobrand")
	public String assigndealertobrand(@RequestParam String dealerName, @RequestParam String brandName) {
		brandService.assignbrandtodealer(dealerName, brandName);
		return "index";
	}

	@RequestMapping("/assignbiketobrand")
	public String assignbiketobrand(Model model) {
		List<Bike> bikes = bikeService.getallbikes();
		model.addAttribute("bike", bikes);
		List<Brand> brands = brandService.getAllbrands();
		model.addAttribute("brand", brands);
		return "assignbike";
	}

	@RequestMapping("/assignbikes")
	public String assignbikes(@RequestParam(value = "bikeName") String bikeName,
			@RequestParam(value = "brandName") String brandName) {
		brandService.assignbikes(bikeName, brandName);
		return "index";
	}

	@RequestMapping("/getbikes")
	public String bikes(Model model) {
		List<Dealer> dealers = dealerService.getAlldealers();
		model.addAttribute("dealer", dealers);
		return "dealerlist";
	}
	
	@RequestMapping("/showallbikes")
	public String getallbikeunderdealer(@RequestParam String dealerName, Model model) throws ServiceException {
		List<Bike> bikes = bikeService.getbikesUnderDealer(dealerName);
		model.addAttribute("bike", bikes);
		return "bikelist";
	}

	@RequestMapping("/getbrandlist")
	public String brandlist(Model model) {
		List<Brand> brands = brandService.getAllbrands();
		model.addAttribute("brand", brands);
		return "showbrands";
	}

	@RequestMapping("/total")
	public String totalinvestment(@RequestParam(value = "brandName") String brandName, Model model) {
		int totalinvestment = brandService.gettotalsinvestment(brandName);
		model.addAttribute("total", totalinvestment);
		return "totalinvestment";
	}
}
package org.springframework.samples.petclinic.appointments;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.Vets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
public class AppoinmentController {
	private static final Logger log = LoggerFactory.getLogger(AppoinmentController.class);
	@GetMapping("/appoints")
	public String showAppoints(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		//the endpoint idto be changed dynamically in your code
		Appointments responseList = restTemplate.getForObject("http://localhost:8080/appointments/owner/23", Appointments.class);

		model.addAttribute("listAppoints", responseList.getBookings());
		return "bookings/tester.html";
	}

	@GetMapping("/bookings")
	public String showVetBookings(Model model) {
		RestTemplate restTemplate = new RestTemplate();
		Appointments responseList = restTemplate.getForObject("http://localhost:8080/appointments/vet/23/bookings/345", Appointments.class);

		model.addAttribute("vetAppoints", responseList.getBookings());
		return "bookings/vetBookings.html";
	}
}

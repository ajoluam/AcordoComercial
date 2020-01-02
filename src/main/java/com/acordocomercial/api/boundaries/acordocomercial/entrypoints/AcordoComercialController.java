package com.acordocomercial.api.boundaries.acordocomercial.entrypoints;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acordocomercial.api.boundaries.acordocomercial.model.AcordoComercialForm;

@RestController
@RequestMapping(value = "/acordoComercial")
public class AcordoComercialController {
	
	@PostMapping
	public ResponseEntity<?> criar(@Valid @RequestBody AcordoComercialForm acordoComercialForm) {
		
		
		return ResponseEntity.ok("ok");
	}

}

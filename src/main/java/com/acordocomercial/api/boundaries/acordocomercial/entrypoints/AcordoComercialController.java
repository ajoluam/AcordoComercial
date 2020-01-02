package com.acordocomercial.api.boundaries.acordocomercial.entrypoints;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.acordocomercial.api.boundaries.acordocomercial.model.AcordoComercialForm;
import com.acordocomercial.api.boundaries.acordocomercial.model.AcordoComercialView;
import com.acordocomercial.api.boundaries.acordocomercial.repositories.AcordoComercialParceiroRepository;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiro;
import com.acordocomercial.api.domain.entity.AcordoComercialParceiroPK;

@RestController
@RequestMapping(value = "/acordoComercial")
public class AcordoComercialController {
	
	@PostMapping
	public ResponseEntity<?> criar(@Valid @RequestBody AcordoComercialForm acordoComercialForm) {
		
		
		return ResponseEntity.ok("ok");
	}
	
	@Autowired
	AcordoComercialParceiroRepository acordoComercialParceiroRepository;
	
	@GetMapping(value = "/{codAcordo}/{numVersao}")
	public ResponseEntity<?> consultar (@PathVariable Integer codAcordo, @PathVariable Integer numVersao){
		
		AcordoComercialParceiro acordo = new AcordoComercialParceiro();
		AcordoComercialParceiroPK acordoPK = new AcordoComercialParceiroPK();
		acordoPK.setNumeroAcordoComercialParceiro(codAcordo);
		acordoPK.setNumeroVersaoAcordoComercial(numVersao);
		
		acordo = acordoComercialParceiroRepository.findById(acordoPK).orElse(null);
		
		AcordoComercialView acordoView = new AcordoComercialView();
		acordoView.setCodigoParceiroComercial(acordo.getCodigoParceiroComercial());
		acordoView.setCodigoProdutoOperacional(acordo.getCodigoProdutoOperacional());
		acordoView.setCodigoSituacao(acordo.getCodigoSituacao());
		
		return ResponseEntity.ok(acordoView);
	}

}

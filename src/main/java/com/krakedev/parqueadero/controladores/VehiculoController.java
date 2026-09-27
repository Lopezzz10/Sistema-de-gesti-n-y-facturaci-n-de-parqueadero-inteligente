package com.krakedev.parqueadero.controladores;

import com.krakedev.parqueadero.modelo.Auto;
import com.krakedev.parqueadero.modelo.Motocicleta;
import com.krakedev.parqueadero.modelo.Vehiculo;
import com.krakedev.parqueadero.servicios.ServicioVehiculos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
	private final ServicioVehiculos servicioVehiculos;
	public VehiculoController(ServicioVehiculos servicioVehiculos) {
		this.servicioVehiculos = servicioVehiculos;
	}
	@PostMapping("/auto")
	public boolean  ingresarAuto(@RequestBody Auto auto) {
		return servicioVehiculos.ingresarVehiculo(auto);
	}
	@PostMapping("/moto")
	public boolean ingresarMoto(@RequestBody Motocicleta moto) {
		return servicioVehiculos.ingresarVehiculo(moto);
	}

	@GetMapping
	public ArrayList<Vehiculo> listarVehiculos() {
		return servicioVehiculos.listarVehiculos();
	}

	@GetMapping("/{placa}")
	public ResponseEntity<Vehiculo> buscarPorPlaca(@PathVariable String placa) {
		Vehiculo vehiculo = servicioVehiculos.buscarPorPlaca(placa);
		if (vehiculo == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(vehiculo);
	}

}
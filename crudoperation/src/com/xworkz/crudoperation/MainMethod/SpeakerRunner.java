package com.xworkz.crudoperation.MainMethod;

import com.xworkz.crudoperation.DAO.SpeakerDAO;
import com.xworkz.crudoperation.DAOIMPL.SpeakerDAOImpl;
import com.xworkz.crudoperation.DTO.SpeakerDTO;

public class SpeakerRunner {
	public static void main(String[] args) {
		SpeakerDTO speakerDTO = new SpeakerDTO();
		speakerDTO.setBrand("sony");
		speakerDTO.setColor("black");
		speakerDTO.setPrice(5000);
		speakerDTO.setVolumeUpto(10);
		speakerDTO.setShape("square");	
		speakerDTO.setWarranty(false);
		speakerDTO.setGuarntee(false);
		speakerDTO.setStand(false);
		speakerDTO.setWoofer(true);
		speakerDTO.setRemote(true);
		speakerDTO.setButtonSystem(true);
		speakerDTO.setUsb(true);
		speakerDTO.setFm(false);
		speakerDTO.setLighting(true);
		
		SpeakerDAO dao=new SpeakerDAOImpl();
		dao.create(speakerDTO);	
	}
}

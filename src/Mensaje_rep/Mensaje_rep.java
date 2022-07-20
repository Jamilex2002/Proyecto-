package Mensaje_rep;

import java.util.ArrayList;
import java.util.List;

import Mensaje.dominio.Mensaje;

public class Mensaje_rep {
	private List<Mensaje> messages = new ArrayList<>();
	private List<Mensaje> mesg = new ArrayList<>();
			
		public Mensaje_rep() {
			messages.add(new Mensaje(1, 1, "Matthew", "Jose", "22/06/2022 10:10 0000", " Hola Joseeee..... Como estas?"));
			messages.add(new Mensaje(1, 2, "Jose", "Matthew", "22/06/2022 10:11 0000", " Hola Matthew.. a los anhos"));
			messages.add(new Mensaje(1, 3, "Matthew", "Jose", "22/06/2022 10:12 0000", " Necesito que me hagaas un favor, prestame dinero.. tendras??"));
			messages.add(new Mensaje(1, 4, "Jose", "Matthew", "22/06/2022 10:13 0000", " Cuanto quieres??"));
			messages.add(new Mensaje(1, 4, "Jose", "Matthew", "22/06/2022 10:14 0000", " Para transferirte"));
			mesg.add(new Mensaje(1, "Matthew", "10:13 a.m","Cuanto quieres??" ));
				
			messages.add(new Mensaje(2, 5, "Cristina", "Jose", "22/06/2022 10:10 0000", "Holaa perdido.."));
			messages.add(new Mensaje(2,6, "Jose", "Cristina", "22/06/2022 10:11 0000", " perdido???"));
			messages.add(new Mensaje(2, 7, "Cristina", "Jose", "22/06/2022 10:10 0000", "JAJAAJAJ"));
			messages.add(new Mensaje(2, 7, "Cristina", "Jose", "22/06/2022 10:10 0000", ":)"));

			mesg.add(new Mensaje(2, "Cristina", "10:11 a.m","perdido!!!" ));
				
			messages.add(new Mensaje(3, 7, "Rafaella", "Jose", "22/06/2022 11:10 0000", "Hola,¿Como estas?"));
			messages.add(new Mensaje(3, 8, "Jose", "Rafaella", "22/06/2022 11:11 0000", " Todo bien, y tu?"));
			messages.add(new Mensaje(3, 9, "Jose", "Rafaella", "22/06/2022 12:10 0000", " Que  tengas una linda tarde..."));
			messages.add(new Mensaje(3, 10, "Rafaella", "Jose", "22/06/2022 11:10 0000", "Igualmente, cuidate :) "));
			messages.add(new Mensaje(3, 11, "Rafaella", "Jose", "22/06/2022 11:10 0000", " saludame a tu mami "));
			mesg.add(new Mensaje(3, "Rafaella", "12:10 p.m", "Que tengas una linda tarde..."));
			
			messages.add(new Mensaje(4, 10, "Jose", "Laura", "22/06/2022 12:10 0000", "Holaaaaa...."));
			messages.add(new Mensaje(4, 10, "Jose", "Laura", "22/06/2022 12:10 0000", "Que tal buenas tardes.."));
			messages.add(new Mensaje(4, 11, "Laura", "Jose", "22/06/2022 12:11 0000", "Hola buenas tardes"));
			messages.add(new Mensaje(4, 12, "Laura", "Jose", "22/06/2022 12:12 0000", "que tal como vas..."));
			messages.add(new Mensaje(4, 13, "Jose", "Laura", "22/06/2022 12:10 0000", "Bien, y tu ?"));
			mesg.add(new Mensaje(4, "Laura", "12:12 p.m", "que tal como vas..."));
				
			messages.add(new Mensaje(5, 12, "Leonel", "Jose", "22/06/2022 15:10 0000", "Holaaa oyeeee...."));
			messages.add(new Mensaje(5, 13, "Leonel", "Jose", "22/06/2022 15:10 0000", "Me puedes ayudar en matematicas..!!!"));
			messages.add(new Mensaje(5, 14, "Jose", "Leonel ", "22/06/2022 15:11 0000", "Si claro???"));
			messages.add(new Mensaje(5, 15, "Leonel ", "Jose", "22/06/2022 16:10 0000", "Mañana por la tarde..."));
			messages.add(new Mensaje(5, 16, "Leonel", "Jose", "22/06/2022 15:10 0000", "Dale veras pero no te olvides"));
			mesg.add(new Mensaje(5, "Leonel ", "   16:10 p.m", "Mañana por la tarde..."));
				
			messages.add(new Mensaje(6, 15, "Emiliano", "Jose", "22/06/2022 20:10 0000", "Holaaaa oyeee......!!"));
			messages.add(new Mensaje(6, 16, "Emiliano", "Jose", "22/06/2022 20:10 0000", "Me puedes enviar tu parte del trabajo.."));
			messages.add(new Mensaje(6, 17, "Jose", "Emiliano", "22/06/2022 20:11 0000", "Mas luego te la envio"));
			messages.add(new Mensaje(6, 18, "Emiliano", "Jose", "22/06/2022 20:10 0000", "Listo"));
			messages.add(new Mensaje(6, 19, "Emiliano", "Jose", "22/06/2022 20:10 0000", "Pero no te olvides "));
			mesg.add(new Mensaje(6, "Emiliano", "   20:10 p.m", "Listo gracias..."));
			
			messages.add(new Mensaje(7, 19, "Albrecht", "Jose", "22/06/2022 15:10 0000", "Me puedes ayudar en matematicas.."));
			messages.add(new Mensaje(7, 20, "Jose", "Albrecht", "22/06/2022 15:11 0000", "Si claro???"));
			messages.add(new Mensaje(7, 21, "Albrecht", "Jose", "22/06/2022 16:10 0000", "Mañana por la tarde..."));
			mesg.add(new Mensaje(7, "Albrecht", "  16:10 p.m", "Mañana por la tarde..."));
				
			messages.add(new Mensaje(8, 22, "Isabell", "Jose", "22/06/2022 20:10 0000", "Me puedes enviar tu parte del trabajo.."));
			messages.add(new Mensaje(8, 23, "Jose", "Isabell", "22/06/2022 20:11 0000", "Mas luego te la envio"));
			messages.add(new Mensaje(8, 24, "Isabell", "Jose", "22/06/2022 20:10 0000", "Listo gracias..."));
			mesg.add(new Mensaje(8, "Isabell", "20:10 p.m", "Listo gracias..."));
			
			messages.add(new Mensaje(9, 25, "Walter", "Jose", "22/06/2022 15:10 0000", "Me puedes ayudar en matematicas.."));
			messages.add(new Mensaje(9, 26, "Jose", "Walter", "22/06/2022 15:11 0000", "Si claro???"));
			messages.add(new Mensaje(9, 27, "Walter", "Jose", "22/06/2022 16:10 0000", "Mañana por la tarde..."));
			mesg.add(new Mensaje(9, "Walter", "  16:10 p.m", "Mañana por la tarde..."));
				
			messages.add(new Mensaje(10, 28, "Adrianna", "Jose", "22/06/2022 20:10 0000", "Me puedes enviar tu parte del trabajo.."));
			messages.add(new Mensaje(10, 29, "Jose", "Adriana", "22/06/2022 20:11 0000", "Mas luego te la envio"));
			messages.add(new Mensaje(10, 30, "Adriana", "Jose", "22/06/2022 20:10 0000", "Listo gracias..."));
			mesg.add(new Mensaje(10, "Adriana", "  20:10 p.m", "Listo gracias..."));
			
			}
			
			public List<Mensaje> getMessage(String from, String to){
				List<Mensaje> result = new ArrayList<>();
				
				for(Mensaje msg: messages) {
					if((msg.getFrom().equals(from) && msg.getTo().equals(to))
							|| (msg.getFrom().equals(to) && msg.getTo().equals(from))) {
						result.add(msg);
					}
				}
				
				return result;
			}
			
			public List<Mensaje> getUser(){
				List<Mensaje> result2 = new ArrayList<>();
				for(Mensaje us: mesg) {
					result2.add(us);
				}
				
				return result2;
			}
}

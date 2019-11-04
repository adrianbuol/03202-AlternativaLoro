/* 
 * Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>
 */
public class Main {

    public static final Locale LCL = new Locale("es", "ES");
    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(LCL);

    public static void main(String[] args) {

        //variables
        String persona;

        //Constantes
        final String Socrates = "Sócrates";

        //Mensaje de inicio
            System.out.printf("Alternativa Loro%n");
            System.out.printf("================%n");
            System.out.print("Persona que se acerca ..: ");
        //Almacenar escrito por pantalla        
            persona = SCN.nextLine();

            System.out.printf("Dueño del loro .........: %s%n", Socrates);
            System.out.println(persona);
        
            System.out.println("---");
        if (persona.equals("Sócrates")) {

            System.out.println("Mensaje Loro ...........: ¡Ave César!");
            System.out.println("---");
        } else {
            System.out.println("Mensaje Loro ...........: ¡Sócrates socorro!");
        }

    }

}

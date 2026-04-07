package org.sistema.service;

import org.sistema.model.Pet;
import org.sistema.model.PetType;
import org.sistema.model.Sex;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Formulario {

    public static void Form(){

        Scanner scanner = new Scanner(System.in);
        Path path = Paths.get("fom.txt");
        Pet newPet = new Pet();


        try {
            List<String> questions = Files.readAllLines(path);

            for (int i = 0; i < questions.size(); i++) {
                System.out.println(questions.get(i));
                System.out.print("Your answer: ");
                String response = scanner.nextLine();


                switch (i) {
                    case 0 -> newPet.setName(response);
                    case 1 -> {
                        PetType type = PetType.valueOf(response.toUpperCase().trim());
                        newPet.setType(type);
                    }
                    case 2 -> {
                        Sex sex = Sex.valueOf(response.toUpperCase().trim());
                        newPet.setSex(sex);
                    }
                    case 3 -> newPet.setAddress(response);
                    case 4 -> newPet.setAge(Integer.parseInt(response));
                    case 5 -> {
                        double weight = Double.parseDouble(response.replace(",", "."));
                        newPet.setWeight(weight);
                    }
                    case 6 -> newPet.setRace(response);
                }
            }

            System.out.println("\n--- Registration Complete! ---");

            System.out.println(newPet.toString());

        } catch (IOException e) {
            System.err.println("Critical Error: 'fom.txt' not found in root folder.");
        } catch (NumberFormatException e) {
            System.err.println("Input Error: Please use numbers for Age and Weight.");
        } catch (IllegalArgumentException e) {
            System.err.println("Input Error: Invalid Pet Type. (Choose DOG, CAT)");
        }
    }


}

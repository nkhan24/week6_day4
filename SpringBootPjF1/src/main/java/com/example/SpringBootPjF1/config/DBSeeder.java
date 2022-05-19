package com.example.SpringBootPjF1.config;

import com.example.SpringBootPjF1.model.Category;
import com.example.SpringBootPjF1.model.Constructor;
import com.example.SpringBootPjF1.model.Driver;
import com.example.SpringBootPjF1.repository.CategoryRepository;
import com.example.SpringBootPjF1.repository.ConstructorRepository;
import com.example.SpringBootPjF1.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DBSeeder implements ApplicationRunner {


    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ConstructorRepository constructorRepository;
    @Autowired
    private DriverRepository driverRepository;
    @Autowired
    private FormulaRepository formulaRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
   Constructor c1 = new Constructor(null,"Ferrari",16,null);
   Constructor c2 = new Constructor(null,"Red Bull Racing RBPT",4,null);
   Constructor c3 = new Constructor(null,"Mercedes",8,null);
   Constructor c4 = new Constructor(null,"McLaren Mercedes",8,null);
   Constructor c5 = new Constructor(null,"Alfa Romeo Ferrari",0,null);
   Constructor c6 = new Constructor(null,"Alpine Renault",0,null);
   Constructor c7 = new Constructor(null,"AlphaTauri RBPT",0,null);
   Constructor c8 = new Constructor(null,"Haas Ferrari",0,null);
   Constructor c9 = new Constructor(null,"Aston Martin Aramco Mercedes",0,null);
   Constructor c10 = new Constructor(null,"Williams Mercedes",9, null);

   Driver d1 = new Driver(null, "Charles", "Leclerc", 0, c1, null);
   Driver d2 = new Driver(null, "Carlos", "Sainz", 0, c1, null);
   Driver d3 = new Driver(null, "Max", "Verstappen", 1, c2, null);
   Driver d4 = new Driver(null, "Sergio", "Perez", 0, c2, null);
   Driver d5 = new Driver(null, "Lewis", "Hamilton", 7, c3, null);
   Driver d6 = new Driver(null, "George", "Russel", 0, c3, null);
   Driver d7 = new Driver(null, "Lando", "Norris", 0, c4, null);
   Driver d8 = new Driver(null, "Daniel", "Ricciardo", 0, c4, null);
   Driver d9 = new Driver(null, "Zhou", "Guanyu", 0, c5, null);
   Driver d10 = new Driver(null, "Valtteri", "Bottas", 0, c5, null);
   Driver d11 = new Driver(null, "Fernando", "Alonso", 2, c6, null);
   Driver d12 = new Driver(null, "Esteban", "Ocon", 0, c6, null);
   Driver d13 = new Driver(null, "Yuki", "Tsunoda", 0, c7, null);
   Driver d14 = new Driver(null, "Pierre", "Gasly", 0, c7, null);
   Driver d15 = new Driver(null, "Mick", "Schumacher", 0, c8, null);
   Driver d16 = new Driver(null, "Kevin", "Magnussen", 0, c8, null);
   Driver d17 = new Driver(null, "Sebastian", "Vettel", 4, c9, null);
   Driver d18 = new Driver(null, "Lance", "Stroll", 0, c9, null);
   Driver d19 = new Driver(null, "Alexander", "Albon", 0, c10, null);
   Driver d20 = new Driver(null,"Nicholas","Latifi",0,c10,null);

   Category cy1 = new Category(null,"F1","","","");
   Category cy2 = new Category(null,"GT3","","","");

   Formula fm1 = new Formula(null,"Bahrain","Bahrain Int Circuit",d1,cy1);
   Formula fm2 = new Formula(null,"Saudi Arabia","Jeddah Corniche Circuit",d1,cy1);
   Formula fm3 = new Formula(null,"Australia","Albert Park",d1,cy1);
   Formula fm4 = new Formula(null,"Italy","Imola",d1,cy1);
   Formula fm5 = new Formula(null,"United States","Miami International Circuit",d1,cy1);
   Formula fm6 = new Formula(null,"Spain","Circuit de Catalunya",d1,cy1);
   Formula fm7 = new Formula(null,"Monaco","Cote d'Azur",d1,cy1);
   Formula fm8 = new Formula(null,"Azerbaijan","Baku City Circuit",d1,cy1);
   Formula fm9 = new Formula(null,"Canada","Circuit Gilles Villeneuve",d1,cy1);
   Formula fm10 = new Formula(null,"Great Britain","Silverstone Circuit",d1,cy1);
   Formula fm11 = new Formula(null,"Austria","Red Bull Ring",d1,cy1);
   Formula fm12 = new Formula(null,"France","Circuit Paul Ricard",d1,cy1);



    }
}

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


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Constructor c1 = new Constructor(null, "Ferrari", 16, null);
        Constructor c2 = new Constructor(null, "Red Bull Racing RBPT", 4, null);
        Constructor c3 = new Constructor(null, "Mercedes", 8, null);
        Constructor c4 = new Constructor(null, "McLaren Mercedes", 8, null);
        Constructor c5 = new Constructor(null, "Alfa Romeo Ferrari", 0, null);
        Constructor c6 = new Constructor(null, "Alpine Renault", 0, null);
        Constructor c7 = new Constructor(null, "AlphaTauri RBPT", 0, null);
        Constructor c8 = new Constructor(null, "Haas Ferrari", 0, null);
        Constructor c9 = new Constructor(null, "Aston Martin Aramco Mercedes", 0, null);
        Constructor c10 = new Constructor(null, "Williams Mercedes", 9, null);
        Constructor c11 = new Constructor(null,"Ferrari GT3",2,null);
        Constructor c12 = new Constructor(null,"Bentley GT3",2,null);
        Constructor c13 = new Constructor(null,"Mercedes GT3",4,null);
        Constructor c14 = new Constructor(null,"BMW M4 GT3",3,null);


        Category cy1 = new Category(null, "F1", "Bahrain", "Bahrain Int Circuit", null);
        Category cy2 = new Category(null, "F1", "Bahrain", "Bahrain Int Circuit", null);
        Category cy3 = new Category(null, "F1", "Australia", "Albert Park", null);
        Category cy4 = new Category(null, "F1", "Italy", "Imola", null);
        Category cy5 = new Category(null, "F1", "United States", "Miami International Circuit", null);
        Category cy6 = new Category(null, "F1", "Spain", "Circuit de Catalunya", null);
        Category cy7 = new Category(null, "F1", "Monaco", "Cote d'Azur", null);
        Category cy8 = new Category(null, "F1", "Azerbaijan", "Baku City Circuit", null);
        Category cy9 = new Category(null, "F1", "Canada", "Circuit Gilles Villeneuve", null);
        Category cy10 = new Category(null, "F1", "Great Britain", "Silverstone Circuit", null);
        Category cy11 = new Category(null, "F1", "Austria", "Red Bull Ring", null);
        Category cy12 = new Category(null, "F1", "France", "Circuit Paul Ricard", null);
        Category cy13 = new Category(null, "GT3", "South Africa", "Kyalami GP", null);
        Category cy14 = new Category(null, "GT3", "United Kingdom", "Brands Hatch", null);
        Category cy15 = new Category(null, "GT3", "Belgium", "Spa Francorchamps", null);
        Category cy16 = new Category(null, "GT3", "Netherlands", "Zandvort", null);
        Category cy17 = new Category(null, "GT3", "Germany", "Nurburgring", null);
        Category cy18 = new Category(null, "GT3", "San Marino", "Misano", null);
        Category cy19 = new Category(null, "GT3", "Hungary", "Hungaroring", null);
        Category cy20 = new Category(null, "GT3", "Japan", "Suzuka", null);


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
        Driver d20 = new Driver(null, "Nicholas", "Latifi", 0, c10, null);

    }
}

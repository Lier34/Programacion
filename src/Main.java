import java.util.List;
import java.util.*;
import java.util.stream.*;

public class Main {
public static void main(String [] args) {

        Coche c1 = new Coche("1234 ABC", "Toyota", 2018 , 18000);
        Coche c2 = new Coche("5678 DEF", "BMW", 2015 , 25000);
        Coche c3 = new Coche("9012 GHI", "Seat", 2012 , 12000);

        Coche c4 = new Coche("3456 JKL", "Toyota", 2020 , 22000);
        Coche c5 = new Coche("7890 MNO", "Audi", 2017 , 30000);
        Coche c6 = new Coche("1122 PQR", "BMW", 2010 , 15000);

        Coche c7 = new Coche("3344 STU", "Seat", 2019 , 16000);
        Coche c8 = new Coche("5566 VWX", "Audi", 2014 , 20000);
        Coche c9 = new Coche("7788 YZA", "Toyota", 2021 , 24000);

        Propietario p1 = new Propietario (
            "Carlos",
            List.of(c1 , c2 , c3));

    Propietario p2 = new Propietario (
             "Ana",
            List.of(c4 , c5 , c6)
            );
    Propietario p3 = new Propietario (
             "Luis",
            List.of(c7 , c8 , c9)
            );
    List<Coche> coches = List.of(c1,c2,c3,c4,c5,c6,c7,c8,c9);

    List<Propietario> propietarios = List.of(p1, p2, p3);

// 1
    List<String> matriculas = coches.stream()
            .map(Coche::getMatricula)
            .toList();

// 2
long totalCoches = coches.stream().count();

// 3
List<Coche> posteriores2015 = coches.stream()
        .filter(c -> c.getAno() > 2015)
        .toList();

// 4
double precioMedio = coches.stream()
        .mapToDouble(Coche::getPrecio)
        .average()
        .orElse(0);

// 5
Coche masCaro = coches.stream()
        .max(Comparator.comparingDouble(Coche::getPrecio))
        .orElse(null);

// 6
boolean hayBMW = coches.stream()
        .anyMatch(c -> c.getMarca().equals("BMW"));

// 7
List<Coche> ordenadosPrecio = coches.stream()
        .sorted(Comparator.comparingDouble(Coche::getPrecio))
        .toList();

// 8
Coche masAntiguo = coches.stream()
        .min(Comparator.comparingInt(Coche::getAno))
        .orElse(null);

// 9
long caros = coches.stream()
        .filter(c -> c.getPrecio() > 20000)
        .count();

// 10
List<String> marcas = coches.stream()
        .map(Coche::getMarca)
        .distinct()
        .toList();

// 11
Map<String, Double> mapa = coches.stream()
        .collect(Collectors.toMap(
                Coche::getMatricula,
                Coche::getPrecio
        ));

// 12
Map<String, List<Coche>> porMarca = coches.stream()
        .collect(Collectors.groupingBy(Coche::getMarca));

// 13
Map<String, List<Coche>> agrupados = coches.stream()
        .collect(Collectors.groupingBy(
                c -> c.getAno() <= 2015 ? "Antiguos" : "Modernos"
        ));

// 14
Map<String, Double> mediaPorMarca = coches.stream()
        .collect(Collectors.groupingBy(
                Coche::getMarca,
                Collectors.averagingDouble(Coche::getPrecio)
        ));

// 15
String todasMatriculas = coches.stream()
        .map(Coche::getMatricula)
        .collect(Collectors.joining(", "));

// 16
long totalToyota = coches.stream()
        .filter(c -> c.getMarca().equals("Toyota"))
        .count();

// 17
List<String> marcasOrdenadas = coches.stream()
        .map(Coche::getMarca)
        .distinct()
        .sorted()
        .toList();

// 18
Coche modernoBarato = coches.stream()
        .filter(c -> c.getAno() > 2015)
        .min(Comparator.comparingDouble(Coche::getPrecio))
        .orElse(null);

// 19
boolean repetidas = coches.stream()
        .map(Coche::getMatricula)
        .distinct()
        .count() != coches.size();

// 20
List<Coche> top3 = coches.stream()
        .sorted(Comparator.comparingDouble(Coche::getPrecio).reversed())
        .limit(3)
        .toList();

// 21
    // a
    List<Coche> todos = propietarios.stream()
        .flatMap(p -> p.getCoches().stream())
        .toList();

    // b
    long total = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .count();

    // c
    List<String> todas = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .map(Coche::getMatricula)
            .toList();

    // d
    boolean existeBMW = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .anyMatch(c -> c.getMarca().equals("BMW"));

    // e
    List<Coche> posteriores2018 = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .filter(c -> c.getAno() > 2018)
            .toList();

    // f
    double mediaTotal = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .mapToDouble(Coche::getPrecio)
            .average()
            .orElse(0);

    // g
    Coche masCaroTodos = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .max(Comparator.comparingDouble(Coche::getPrecio))
            .orElse(null);

    // h
    List<String> repetidasEntreProp = propietarios.stream()
            .flatMap(p -> p.getCoches().stream())
            .collect(Collectors.groupingBy(
                    Coche::getMatricula,
                    Collectors.counting()
            ))
            .entrySet().stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .toList();
}
}

package com.gla.LamdaExpression;
import java.util.*;
import java.util.stream.*;

class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }
}
public class InvoiceObject {
    public static void main(String[] args) {

        List<Integer> ids = Arrays.asList(29, 289, 3778);

        List<Invoice> invoices = ids.stream()
                .map(Invoice::new)
                .collect(Collectors.toList());

        for (Invoice i : invoices) {
            System.out.println(i.id);
        }
    }
}

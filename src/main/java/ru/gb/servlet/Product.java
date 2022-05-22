package ru.gb.servlet;

import javax.servlet.annotation.WebServlet;
@WebServlet(name = "Cart", urlPatterns = "/cart")

// Создайте класс Product с полями (id, title, cost);
public class Product{
    private long id;
    private String title;
    private int cost;

    public Product(long id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public Product() {
    }

    public long getId() { return id; }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    @Override
    public String toString() {
        return  "id: " + id + ',' +
                " title: " + title + ',' +
                " cost: " + cost ;
    }
}

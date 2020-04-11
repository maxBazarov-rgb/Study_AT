package com.company;

public abstract class Vector2d {
    public double X;
    public double Y;

    public Vector2d(double X, double Y) {
        this.X = X;
        this.Y = Y;
    }

    public void add(Vector2d v) {
        this.Y = Y + Y;
        this.X = X + X;
    }

    public void subtract(Vector2d v) {
        this.Y = Y - Y;
        this.X = X - X;
    }
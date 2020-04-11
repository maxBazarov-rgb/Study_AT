package com.company;

public class Vector3d {
    private double x,y,z;

    public Vector3d (double x, double y, double z) {
         this.x = x;
         this.y = y;
         this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
           public Vector3d add (Vector3d a) {
               return new Vector3d(x = this.getX() + a.getX(),
                       y = this.getX() + a.getY(),
                       z = this.getZ() + a.getZ());
           }
            public Vector3d subtract (Vector3d a) {
                return new Vector3d(x = this.getX() - a.getX(),
                        y = this.getX() - a.getY(),
                        z = this.getZ() - a.getZ());
            }
    public double scolarMultiply (Vector3d a){
         return this. getX()+a.getX()+
                this. getY()+a.getY()+
                this.getZ()+a.getZ();
    }
public Vector3d vectorMultiply (Vector3d a){
        double newX; double newY; double newZ;
    {

        newX = this.getY() * a.getZ() - this.getZ() * a.getY();
        newY = this. getZ() * a. getX() - this. getX() * a. getZ();
        newZ = this. getX() * a. getY() - this. getY() * a. getX();

    }
    
return new Vector3d(newX, newY, newZ); }} 

















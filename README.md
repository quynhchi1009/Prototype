# Prototype
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

- declares a common interface for all objects that support cloning

    Circle(Circle source) {
        super(source);
        this.radius = source.radius;
    }
    
    //The method clone() creates an object of the current class and carries over all of the field values of the old object into the new one. 
    public Shape clone() {
        return new Circle(this);
    }
    
- Prototype registry implementation with HashMap
- when your code shouldn’t depend on the concrete classes of objects that you need to copy
- when you want to reduce the number of subclasses that only differ in the way they initialize their respective objects

Prototype:
- isn’t based on inheritance, so it doesn’t have its drawbacks
- requires a complicated initialization of the cloned object
Factory Method:
- is based on inheritance
- doesn’t require an initialization step

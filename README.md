# Dynamic_method_dispatch
See How Java resolves rutime polymorphism

We know that polymorphism in Java is the fact that a superclass reference can point to a subclass object.
but what happens if we have many subclasses overriding the supeclass method with their own versions?
When an overriden method is called through a superclass reference, java determines which version of that method to execute based upon the 
type of object being referenced at the time the call occurs. This is called DYNAMIC METHOD DISPATCH and is one of the powers of java language.


Nous savons que le polymorphisme en Java est le fait qu'une référence de superclasse peut pointer vers un objet de sous-classe.
Mais que se passe-t-il si nous avons plusieurs sous-classes qui modifient la méthode supeclass par leurs propres versions?
Lorsqu'une méthode modifiee est appelée à travers une référence superclasse, java détermine quelle version de cette méthode doit être exécutée en fonction de la type d'objet référencé au moment où l'appel se produit. C'est ce qu'on appelle DYNAMIC METHOD DISPATCH et est l'une des puissances du langage java.


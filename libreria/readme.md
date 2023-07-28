# Descripción del proyecto librería 
## anotaciones con  *markdown*
esto es parte del **código** 

```java
 * and open the template in the editor.
 */
package libreria.entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author gcopes
 */
@Entity
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long isbn;
    private String titulo;
    private Integer anio;
    private Integer ejemplaresPrestados;
    private Integer ejemplares;
    private Integer ejemplaresRestantes;
    private Boolean alta;
    @OneToOne
    private Autor autor;
    @OneToOne
    private Editorial editorial;

    public Libro() {
    }
   ```
> sita
y este es mi github:
[github.com/gustavocopes](https://github.com/gustavocopes "Git de Gustavo") 

| tabla | otra column| 
|-------|------------|

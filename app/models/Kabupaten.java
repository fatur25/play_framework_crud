package models;

import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;

@Entity
public class Kabupaten extends Model {
    public String nama_kabupaten;

    public String toString(){
        return this.nama_kabupaten;
    }
}
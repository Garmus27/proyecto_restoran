import java.time.Duration;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //pais
        Pais pais = new Pais();
        pais.setNombre("Argentina");
        Provincia provincia = new Provincia("Mendoza",pais);
        Localidad maipu = new Localidad("Maipu",provincia);
        Localidad godoyCruz = new Localidad("Godoy Cruz",provincia);
        Localidad guaymallen = new Localidad("Guaymallen",provincia);

        // usuarios
        Usuario usuario1 = new Usuario("chinguencha");
        Usuario usuario2 = new Usuario("anacleto");

        Cliente cliente1 = new Cliente("David","Lopez","2615848235","locolope@gmail.com");
        cliente1.setUsuario(usuario1);
        cliente1.setDomicilio(new Domicilio("calle falsa",123,5513,guaymallen));


        Cliente cliente2 = new Cliente("Fomas","Terro","2613748194","fomi_del_campo@gmail.com");
        cliente2.setUsuario(usuario2);
        cliente2.setDomicilio(new Domicilio("carril garompa",1500,5514,godoyCruz ));


        Domicilio domicilio = new Domicilio("Miguel Cane",859,5511,maipu);
        Sucursal sucursal1= new Sucursal("Casa Matriz", LocalDate.now(),LocalDate.now().plus(Duration.ofHours(8)),true);
        sucursal1.setDomicilio(domicilio);

        Categoria categoria1= new Categoria("Galletas");
        Categoria subCategoria1= new Categoria("galletasDulces");
        categoria1.addCategoria(subCategoria1);
    }
}
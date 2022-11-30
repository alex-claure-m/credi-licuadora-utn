import domain.model.entities.db.EntityManagerHelper;
import domain.model.entities.producto.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Producto medias = new Producto("medias4", "lana4 ",150, LocalDate.now(),Boolean.TRUE);

        Contenido tachas = new Contenido("tachas4", 50);

        TipoPersonalizacion estrellas = new TipoPersonalizacion("tachas de tipo estrellas 4 ");

        AreaTipoPersonalizable centroConTachasEstrella = new AreaTipoPersonalizable(Areas.CENTRO);

        centroConTachasEstrella.setTiposDePersonalizaciones(estrellas);

        Personalizacion mediasTacheras = new Personalizacion(tachas);

        mediasTacheras.setAreasPersonalizables(centroConTachasEstrella);

        ProductoPersonalizado mediasAltasTachas = new ProductoPersonalizado(medias);

        mediasAltasTachas.agregarPersonalizacion(mediasTacheras);

        medias.agregarAreaYtipoPersonalizable(centroConTachasEstrella);


        EntityManagerHelper.beginTransaction();
        EntityManagerHelper.getEntityManager().persist(medias);
        //EntityManagerHelper.getEntityManager().persist(remeraConBowie);
        //EntityManagerHelper.getEntityManager().persist(logo);
        //EntityManagerHelper.getEntityManager().persist(mano);
        //EntityManagerHelper.getEntityManager().persist(boxerConLogo);
        // EntityManagerHelper.getEntityManager().persist(remeraConTexto);
        //EntityManagerHelper.getEntityManager().persist(texto);
        EntityManagerHelper.commit();
    }
}


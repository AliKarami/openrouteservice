package heigit.ors.services.routing.requestprocessors.gpx;

import heigit.ors.services.routing.requestprocessors.gpx.beans.Gpx;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class XMLBuilder {

    /**
     * {@link XMLBuilder} functions as an empty placeholder class.
     */
    XMLBuilder() {

    }

    /**
     * The function creates a XML Element from a GPX.
     *
     * @param gpx Needs a gpx as an Input.
     * @return Returns the GPX as a well formatted XML
     * @throws JAXBException
     */
    public String Build(Gpx gpx) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Gpx.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        m.marshal(gpx, sw);
        String result = sw.toString();
        return result;
    }
}

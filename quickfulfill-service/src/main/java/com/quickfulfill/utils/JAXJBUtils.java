package com.quickfulfill.utils;

import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** 
 * 
 * @author Techouts-1194
 *
 */
public class JAXJBUtils {
	private static final Logger LOG = LoggerFactory.getLogger(JAXJBUtils.class);
	
	static {
		System.setProperty("javax.xml.bind.context.factory",
				"org.eclipse.persistence.jaxb.JAXBContextFactory");
	}

	/**
	 * Convert object to xml of any class type
	 *
	 * @param classType
	 * @param data
	 * @return if any exception raise return blank.Otherwize return xml string
	 */
	public static String getXML(final Class<?> classType, final Object data)
	{
		JAXBContext jaxbContext = null;
		StringWriter writer = null;
		String result = "";
		try
		{
			jaxbContext = JAXBContext.newInstance(classType);
			final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			writer = new StringWriter();
			jaxbMarshaller.marshal(classType.cast(data), writer);
			result = writer.toString();
		}
		catch (final JAXBException jaxb)
		{
			LOG.error("Error while convert object to xml :Reason {}", jaxb.getMessage());
		}
		return result;
	}
	
	/**
	 * Convert object to json of any class type
	 *
	 * @param classType
	 * @param data
	 * @return if any exception raise return blank.Otherwize return json string
	 */
	public static String getJSON(final Class<?> classType, final Object data)
	{
		JAXBContext jaxbContext = null;
		StringWriter writer = null;
		String result = "";
		try
		{
			jaxbContext = JAXBContext.newInstance(classType);
			final Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(MarshallerProperties.MEDIA_TYPE,"application/json");
			jaxbMarshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, true);
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			writer = new StringWriter();
			jaxbMarshaller.marshal(classType.cast(data), writer);
			result = writer.toString();
		}
		catch (final JAXBException jaxb)
		{
			LOG.error("Error while convert object to xml :Reason {}", jaxb.getMessage());
		}
		return result;
	}

	/**
	 * Convert xml/json to given type class object
	 *
	 * @param <T>
	 *
	 * @param classType
	 * @param xml/json
	 * @return if any exception raise, return null
	 */
	public static <T> T xmlToObject(final Class<T> classType, final String xmlJson)
	{
		JAXBContext jxb = null;
		T result = null;
		try
		{
			jxb = JAXBContext.newInstance(classType);
			final Unmarshaller unmarshaller = jxb.createUnmarshaller();
			final StringReader reader = new StringReader(xmlJson);
			result = classType.cast(unmarshaller.unmarshal(reader));
		}
		catch (final JAXBException jaxb)
		{
			LOG.error("Error while convert xml to object :Reason {}", jaxb.getMessage());
		}
		return result;
	}

}

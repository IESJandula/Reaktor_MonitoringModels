package es.iesjandula.reaktor.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author David Martinez
 *
 */
@Data
@NoArgsConstructor
public class ComputerError extends Exception
{
	/** Serial version para identificar la excepcion */
	private static final long serialVersionUID = -628975777962427933L;

	/**Codigo del error cometido */
	private int code;

	/**Descripcion del error cometido */
	private String text;
	
	/**Causa externa del error cometido */
	private Exception exception;
	
	/**
	 * Constructor que crea la excepcion del proyecto usando un codigo de error
	 * un mensaje como descripcion y una causa externa
	 * @param code
	 * @param text 
	 * @param exception 
	 */
	public ComputerError(int code, String text,Exception exception) 
	{
		super(text,exception);
		this.code=code;
		this.text=text;
		this.exception = exception;
	}
	/**
	 * Constructor que crea la excepcion del proyecto usando un codigo de error 
	 * y un mensaje como descripcion
	 * @param code
	 * @param text
	 */
	public ComputerError(int code,String text)
	{
		super(text);
		this.code = code;
		this.text = text;
	}
	
	/**
	 * Metodo que mapea el error para mostrarlo de forma ordenada al cliente
	 * @return Mapa organizado en clave valor <String,String> que devuelve como clave el nombre del atributo y como valor el valor del mismo
	 */
	public Map<String,String> toMap()
	{
		Map<String,String> mapException = new HashMap<String,String>();
		
		mapException.put("codigo", String.valueOf(this.code));
		mapException.put("descripcion", this.text);
		
		if(this.exception!=null)
		{
			String stackTrace = ExceptionUtils.getStackTrace(this.exception);
			mapException.put("stackTrace", stackTrace);
		}
		
		return mapException;
	}

}

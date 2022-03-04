package EqualsAndHashCode;

import lombok.EqualsAndHashCode;

/**
 * @author CodeCoderCoding
 */
@EqualsAndHashCode
public class EqualsAndHashCodeDemo {
    private transient int transVar = 10;
    private Integer id;
    private String name;
    private String url;
}

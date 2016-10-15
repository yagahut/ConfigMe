package com.github.authme.configme;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for methods in {@link SettingsHolder} classes that return section comments to include
 * when saving to a file. The return type of the method must be {@code Map&lt;String, String[]>},
 * where the key is the path and the String[] value contains the comments to include.
 * <p>
 * Methods annotated with this method must be accessible (i.e. {@code public}) and have return type
 * {@code Map&lt;String, String[]>}. Null may be returned. There may be multiple methods with this
 * annotation.
 * <p>
 * Comments over properties must be declared on property fields with {@link Comment}. Any keys in
 * the returned map that does not exist as map will simply be ignored. The value of a map entry may
 * be null. Multiple {@link SectionComments} methods may return a comment for the same path;
 * however, no guarantee is given as to which comment will be used.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SectionComments {

}

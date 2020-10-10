package com.gavin.Lambda.s3;

@FunctionalInterface
public interface Converter {

	Integer convert(String from);
}

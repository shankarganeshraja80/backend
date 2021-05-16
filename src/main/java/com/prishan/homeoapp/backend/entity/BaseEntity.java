package com.prishan.homeoapp.backend.entity;

import lombok.Data;

/**
 * Base Entity
 * 
 * @author shankaran79
 * @param <T>
 *
 */
@Data
public abstract class BaseEntity<T> extends Entity<T> {
	private T id;
	private boolean isModified;
	private String name;

}

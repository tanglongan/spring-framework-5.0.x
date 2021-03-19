package org.springframework.core;

import org.springframework.lang.Nullable;

/**
 * 用于设置和访问元数据的通用接口
 */
public interface AttributeAccessor {

	/**
	 * 为给定名称的属性设置给定的值
	 */
	void setAttribute(String name, @Nullable Object value);

	/**
	 * 返回给定名称的属性值；如果属性不存在就返回null
	 */
	@Nullable
	Object getAttribute(String name);

	/**
	 * 移除指定名称的属性，同时返回属性值
	 * 注：如果没有该名称的属性，就返回null
	 */
	@Nullable
	Object removeAttribute(String name);

	/**
	 * 判断是否有指定名称的属性
	 */
	boolean hasAttribute(String name);

	/**
	 * 返回Bean的所有属性名
	 */
	String[] attributeNames();

}

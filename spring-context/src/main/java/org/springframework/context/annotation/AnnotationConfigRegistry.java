/*
 * Copyright 2002-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.context.annotation;

/**
 * 基于注解配置的应用上下文的公共接口
 * 主要是定义register()和scan()方法
 */
public interface AnnotationConfigRegistry {

	/**
	 * 注册并处理一个或多个注解配置类
	 * 注：register()方法是幂等的：多个相同的配置类名与一个类名最终都是相同处理结果
	 */
	void register(Class<?>... annotatedClasses);

	/**
	 * 在指定的包名中扫描注解类
	 */
	void scan(String... basePackages);

}

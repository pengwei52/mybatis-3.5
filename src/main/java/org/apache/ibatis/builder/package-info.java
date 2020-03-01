/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/**
 * Base package for the Configuration building code
 * 包含Configuration对象所有构造器，主要包括XML、注解两种方式的配置解析
 * 	XMLConfigBuilder 解析configuration.xml配置文件
 * 	XMLMapperBuilder 解析Mapper.xml配置文件
 * 	XMLStatementBuilder 解析select/update/delete标签
 * 	MapperAnnotationBuilder 注解式Mapper
 */
package org.apache.ibatis.builder;

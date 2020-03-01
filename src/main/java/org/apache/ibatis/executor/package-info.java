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
 * Contains the statement executors.
 * 包含SQL语句执行器，核心功能包括：
 * 	主键生成功能
 * 	执行参数解析功能
 * 	执行结果集解析功能
 * 	SQL执行器
 * 	缓存执行器
 * ErrorContext 错误上下文对象，跟踪所有执行流程
 */
package org.apache.ibatis.executor;

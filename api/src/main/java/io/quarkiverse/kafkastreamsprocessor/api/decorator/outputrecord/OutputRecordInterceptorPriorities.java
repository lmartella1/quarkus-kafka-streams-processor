/*-
 * #%L
 * Quarkus Kafka Streams Processor
 * %%
 * Copyright (C) 2024 Amadeus s.a.s.
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package io.quarkiverse.kafkastreamsprocessor.api.decorator.outputrecord;

/**
 * Priorities of the output record interceptors the framework provides.
 */
public final class OutputRecordInterceptorPriorities {
    /**
     * Priority of the interceptor that will inject the tracing headers for propagation.
     */
    public static final int TRACING = 100;

    private OutputRecordInterceptorPriorities() {

    }
}

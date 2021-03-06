/*
 * Copyright (C) 2013 Sebastian Kaspari
 *
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
 */

package com.androidzeitgeist.ani.transmitter;

/**
 * Wrapper exception for all kind of low level exceptions that can be thrown by
 * the implementation of the {@link Transmitter} class.
 */
@SuppressWarnings("serial")
public class TransmitterException extends Exception {
    /**
     * Constructs a new {@link TransmitterException} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param cause the cause of this exception.
     */
    public TransmitterException(String detailMessage, Throwable cause) {
        super(detailMessage, cause);
    }
}

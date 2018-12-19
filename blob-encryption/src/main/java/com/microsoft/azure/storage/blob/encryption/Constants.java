/*
 * Copyright Microsoft Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.azure.storage.blob.encryption;

/**
 * RESERVED FOR INTERNAL USE. Contains storage constants.
 */
final class Constants {

    static final int KB = 1024;

    static final int MB = 1024 * KB;

    static final String USER_AGENT_VERSION = "10.0.0-Preview";

    static final String ENCRYPTION_PROTOCOL_V1 = "1.0";

    static final String AGENT_METADATA_KEY = "EncryptionLibrary";

    static final String AGENT_METADATA_VALUE = "Java Async " +  USER_AGENT_VERSION;

    static final String AES_CBC_PKCS5PADDING = "AES/CBC/PKCS5Padding";

    static final String AES_CBC_NO_PADDING = "AES/CBC/NoPadding";

    static final String AES = "AES";

    static final String ENCRYPTION_DATA_KEY = "encryptiondata";

    static final String ENCRYPTION_MODE = "FullBlob";

}
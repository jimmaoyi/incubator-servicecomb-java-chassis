/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.foundation.vertx.client.tcp;

import io.vertx.core.buffer.Buffer;

public class TcpData {
    private Buffer headerBuffer;

    private Buffer bodyBuffer;

    public TcpData(Buffer headerBuffer, Buffer bodyBuffer) {
        this.headerBuffer = headerBuffer;
        this.bodyBuffer = bodyBuffer;
    }

    public Buffer getHeaderBuffer() {
        return headerBuffer;
    }

    public void setHeaderBuffer(Buffer headerBuffer) {
        this.headerBuffer = headerBuffer;
    }

    public Buffer getBodyBuffer() {
        return bodyBuffer;
    }

    public void setBodyBuffer(Buffer bodyBuffer) {
        this.bodyBuffer = bodyBuffer;
    }
}

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
package io.servicecomb.swagger.generator.core.processor.annotation.models;

import java.util.ArrayList;
import java.util.List;

import io.servicecomb.swagger.generator.core.processor.annotation.AnnotationUtils;

import io.swagger.annotations.ResponseHeader;
import io.swagger.models.Response;

public class ResponseConfig extends ResponseConfigBase {
    private int code;

    private List<ResponseHeaderConfig> responseHeaders;

    // 根据本config生成的response
    private Response response;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<ResponseHeaderConfig> getResponseHeaders() {
        return responseHeaders;
    }

    public void setResponseHeaders(List<ResponseHeaderConfig> responseHeaders) {
        this.responseHeaders = responseHeaders;
    }

    public void setResponseHeaders(ResponseHeader[] responseHeaders) {
        this.responseHeaders = new ArrayList<>();
        for (ResponseHeader header : responseHeaders) {
            ResponseHeaderConfig config = AnnotationUtils.convert(header);
            if (config != null) {
                this.responseHeaders.add(config);
            }
        }

        if (this.responseHeaders.isEmpty()) {
            this.responseHeaders = null;
        }
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }
}

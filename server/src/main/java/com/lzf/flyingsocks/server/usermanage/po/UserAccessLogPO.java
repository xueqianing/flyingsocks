/*
 * Copyright (c) 2019 abc123lzf <abc123lzf@126.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.lzf.flyingsocks.server.usermanage.po;

import java.time.Instant;

/**
 * @author lzf abc123lzf@126.com
 * @since 2021/2/15 2:48 下午
 */
public class UserAccessLogPO {

    private Long id;

    private Integer userId;

    private String address;

    private Long uploadTrafficUsage;

    private Long downloadTrafficUsage;

    private Instant connectTime;

    private Instant disconnectTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getUploadTrafficUsage() {
        return uploadTrafficUsage;
    }

    public void setUploadTrafficUsage(Long uploadTrafficUsage) {
        this.uploadTrafficUsage = uploadTrafficUsage;
    }

    public Long getDownloadTrafficUsage() {
        return downloadTrafficUsage;
    }

    public void setDownloadTrafficUsage(Long downloadTrafficUsage) {
        this.downloadTrafficUsage = downloadTrafficUsage;
    }

    public Instant getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Instant connectTime) {
        this.connectTime = connectTime;
    }

    public Instant getDisconnectTime() {
        return disconnectTime;
    }

    public void setDisconnectTime(Instant disconnectTime) {
        this.disconnectTime = disconnectTime;
    }
}

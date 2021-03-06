/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 developers-payu-latam
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
package com.payu.sdk.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 * Represents a Bcash request in the PayU SDK
 *
 * @author <a href="mailto:he.alarcon@transportsystems.co">Hernán Alarcón</a>
 * @version 1.1.12, 21/10/2016
 * @since 1.1.12
 */
@XmlRootElement(name = "bcashRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class BcashRequest implements Serializable {

	/** The content type */
	@XmlElement(required = true)
	private String contentType;
	/** The content */
	@XmlElement(required = true)
	private String content;

	/**
	 * Returns the content type
	 *
	 * @return the content type
	 */
	public String getContentType() {

		return contentType;
	}

	/**
	 * Returns the content
	 *
	 * @return the content
	 */
	public String getContent() {

		return content;
	}

	/**
	 * Sets the content type
	 *
	 * @param contentType the content type to set
	 */
	public void setContentType(String contentType) {

		this.contentType = contentType;
	}

	/**
	 * Sets the content
	 *
	 * @param content the content to set
	 */
	public void setContent(String content) {

		this.content = content;
	}

}

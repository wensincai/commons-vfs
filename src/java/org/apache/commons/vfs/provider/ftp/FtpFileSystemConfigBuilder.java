/*
 * Copyright 2002, 2003,2004 The Apache Software Foundation.
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
package org.apache.commons.vfs.provider.ftp;

import org.apache.commons.vfs.FileSystemConfigBuilder;

/**
 * The config builder for various ftp configuration options
 *
 * @author <a href="mailto:imario@apache.org">Mario Ivankovits</a>
 * @version $Revision: 1.1 $ $Date: 2004/05/01 18:14:28 $
 */
public class FtpFileSystemConfigBuilder extends FileSystemConfigBuilder
{
    private final static FtpFileSystemConfigBuilder builder = new FtpFileSystemConfigBuilder();

    public static FtpFileSystemConfigBuilder getInstance()
    {
        return builder;
    }

    /* as soon as commons-1.2 will be released
    public void setFTPFileEntryParserFactory(FileSystemOptions opts, FTPFileEntryParserFactory factory)
    {
        setParam(opts, FTPFileEntryParserFactory.class.getName(), factory);
    }

    public FTPFileEntryParserFactory getFTPFileEntryParserFactory(FileSystemOptions opts)
    {
        return (FTPFileEntryParserFactory) getParam(opts, FTPFileEntryParserFactory.class.getName());
    }
    */

    protected Class getFileSystemClass()
    {
        return FtpFileSystem.class;
    }
}
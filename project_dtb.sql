USE [ProjectPRJ301]
GO
/****** Object:  Table [dbo].[Account_Role] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_Role](
	[Account] [nvarchar](40) NOT NULL,
	[RoleID] [int] NULL,
 CONSTRAINT [PK_Account_Role] PRIMARY KEY CLUSTERED 
(
	[Account] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Account_Role

/****** Object:  Table [dbo].[Categories] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Categories](
	[CategoryID] [int] IDENTITY(1,1) NOT NULL,
	[CategoryName] [nvarchar](15) NULL,
	[Description] [varchar](150) NULL,
 CONSTRAINT [PK_Categories] PRIMARY KEY CLUSTERED 
(
	[CategoryID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Categories

/****** Object:  Table [dbo].[Customer] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Customer](
	[CustomerID] [int] IDENTITY(1,1) NOT NULL,
	[Account] [nvarchar](40) NOT NULL,
	[Password] [nvarchar](40) NULL,
	[Name] [nvarchar](40) NULL,
	[Gender] [nvarchar](40) NULL,
	[PhoneNumber] [nvarchar](40) NULL,
	[Email] [nvarchar](40) NULL,
	[DOB] [datetime] NULL,
	[Address] [nvarchar](40) NULL,
 CONSTRAINT [PK_Customer] PRIMARY KEY CLUSTERED 
(
	[CustomerID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Customer

/****** Object:  Table [dbo].[Feature] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feature](
	[FeatureID] [int] NOT NULL,
	[url] [varchar](500) NULL,
 CONSTRAINT [PK_Feature] PRIMARY KEY CLUSTERED 
(
	[FeatureID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Feature

/****** Object:  Table [dbo].[Order] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[OrderID] [int] IDENTITY(1,1) NOT NULL,
	[CustomerID] [int] NULL,
	[ProductID] [int] NULL,
	[OrderDate] [datetime] NULL,
	[TotalMoney] [money] NULL,
	[Address] [nvarchar](40) NULL,
	[PhoneNumber] [nvarchar](20) NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[OrderID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from [dbo].[Order]

/****** Object:  Table [dbo].[Product] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [varchar](150) NOT NULL,
	[SupplierID] [int] NULL,
	[Quantity] [nvarchar](40) NULL,
	[Price] [money] NULL,
	[NumberOfImport] [int] NULL,
	[NumberOfSell] [int] NULL,
	[ImagePath] [varchar](150) NULL,
	[CategoryID] [int] NULL,
	[Description] [varchar](150) NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Product

/****** Object:  Table [dbo].[Role] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role](
	[RoleID] [int] NOT NULL,
	[RoleName] [nvarchar](150) NULL,
 CONSTRAINT [PK_Role] PRIMARY KEY CLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Role

/****** Object:  Table [dbo].[Role_Feature] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Role_Feature](
	[RoleID] [int] NULL,
	[FeatureID] [int] NULL
) ON [PRIMARY]
GO

select * from Role_Feature

/****** Object:  Table [dbo].[Supplier] ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Supplier](
	[SupplierID] [int] IDENTITY(1,1) NOT NULL,
	[CompanyName] [nvarchar](30) NULL,
	[ContactName] [nvarchar](30) NULL,
	[Address] [nvarchar](30) NULL,
	[City] [nvarchar](30) NULL,
	[PostalCode] [nvarchar](30) NULL,
	[Phone] [nvarchar](30) NULL,
 CONSTRAINT [PK_Supplier] PRIMARY KEY CLUSTERED 
(
	[SupplierID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

select * from Supplier

create table BillDetail(ProductID int foreign key references Product(ProductID),
OrderID int foreign key references [dbo].[Order](OrderID), Quantity int, Price money, TotalMoney money,
primary key(ProductID,OrderID))

INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'haha', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'huy', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'linh', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'long', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'longdai', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'mrc', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'quan', 1)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'quang', 2)
INSERT [dbo].[Account_Role] ([Account], [RoleID]) VALUES (N'thnhl', 2)

SET IDENTITY_INSERT [dbo].[Categories] ON 
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (1, N'Shirt', N'Shirt')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (2, N'Trouser', N'Trouser')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (3, N'Accesories', N'Jewelry')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (4, N'Watch', N'Apple')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (5, N'Shoes', N'Sneaker')
INSERT [dbo].[Categories] ([CategoryID], [CategoryName], [Description]) VALUES (6, N'Jacket', NULL)
SET IDENTITY_INSERT [dbo].[Categories] OFF

SET IDENTITY_INSERT [dbo].[Customer] ON 
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (4, N'quan', N'123456', N'Quan', N'1', N'0869997926', N'quancua303@gmail.com', CAST(N'2000-03-30T00:00:00.000' AS DateTime), N'hanoi')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (5, N'long', N'123456', N'LongLV', N'0', N'324567467377', N'long123@gmail.com', CAST(N'2020-10-23T00:00:00.000' AS DateTime), N'hanoi')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (6, N'thnhl', N'123456', N'Thanh oc', N'1', N'0366412000', N'thanhoccon@gmail.com', CAST(N'2020-10-14T00:00:00.000' AS DateTime), N'da nang')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (7, N'quang', N'quangquat', N'quang', N'1', N'21412421412412', N'quangquat@gmail.com', CAST(N'2020-10-09T00:00:00.000' AS DateTime), N'hanoi')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (8, N'longdai', N'123456', N'long bo', N'1', N'21321321312', N'longdai@gmail.com', CAST(N'2020-10-15T00:00:00.000' AS DateTime), N'fpt')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (9, N'linh', N'123456', N'Linh che', N'0', N'513131351', N'linhche@gmail.com', CAST(N'2020-10-21T00:00:00.000' AS DateTime), N'fpt')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (10, N'huy', N'huybeo', N'Huy Beo', N'1', N'2435351313', N'huybeo@gmail.com', CAST(N'2020-11-05T00:00:00.000' AS DateTime), N'o nha')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (14, N'haha', N'haha', N'Test', N'1', N'0866654327', N'abc@gmail.com', CAST(N'2000-10-15T00:00:00.000' AS DateTime), N'hanoi')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (15, N'test', N'test', N'testokroi', N'1', N'0382052723', N'quancua303@gmail.com', CAST(N'2020-11-27T00:00:00.000' AS DateTime), N'HCMcity')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (16, N'mrc', N'mrc', N'Mrc', N'1', N'12321321', N'sadasd@gmail.osdsa', CAST(N'2020-11-13T00:00:00.000' AS DateTime), N'sdas')
INSERT [dbo].[Customer] ([CustomerID], [Account], [Password], [Name], [Gender], [PhoneNumber], [Email], [DOB], [Address]) VALUES (16, N'trung', N'trung123', N'thanhtrung', N'1', N'0387037855', N'thanhtrung@gmail.com', CAST(N'2001-10-02T00:00:00.000' AS DateTime), N'ha noi')
SET IDENTITY_INSERT [dbo].[Customer] OFF

INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (1, N'/add')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (2, N'/update')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (3, N'/delete')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (4, N'/productDetail')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (5, N'/myAccount')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (6, N'delete')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (7, N'/blog')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (8, N'/Process_Cart')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (9, N'/contact')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (10, N'/checkout')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (11, N'/cart')
INSERT [dbo].[Feature] ([FeatureID], [url]) VALUES (12, N'/listProduct')

SET IDENTITY_INSERT [dbo].[Order] ON 
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (1, 4, 7, CAST(N'2020-11-11T00:38:47.840' AS DateTime), 100.0000, N'hanoi', N'21321321312')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (2, 4, 7, CAST(N'2020-11-11T00:44:13.700' AS DateTime), 100.0000, N'hanoi', N'123123123')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (5, 5, 10, CAST(N'2020-11-11T01:02:07.707' AS DateTime), 200.0000, N'hcm', N'123123123')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (9, 4, 8, CAST(N'2020-11-11T08:47:01.637' AS DateTime), 549.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (10, 5, 7, CAST(N'2020-11-11T08:48:49.140' AS DateTime), 749.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (11, 5, 14, CAST(N'2020-11-11T08:48:49.157' AS DateTime), 220.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (12, 10, 12, CAST(N'2020-11-11T08:50:43.497' AS DateTime), 449.0000, N'o nha', N'2435351313')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (13, 10, 16, CAST(N'2020-11-11T08:50:43.510' AS DateTime), 140.0000, N'o nha', N'2435351313')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (14, 5, 6, CAST(N'2020-11-11T13:00:14.083' AS DateTime), 800.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (15, 5, 8, CAST(N'2020-11-11T13:00:14.107' AS DateTime), 549.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (16, 5, 7, CAST(N'2020-11-11T13:00:14.120' AS DateTime), 749.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (17, 4, 32, CAST(N'2020-11-11T17:16:21.400' AS DateTime), 400.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (18, 4, 7, CAST(N'2020-11-11T17:16:21.413' AS DateTime), 749.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (19, 5, 7, CAST(N'2020-11-16T10:11:52.930' AS DateTime), 749.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (20, 5, 8, CAST(N'2020-11-16T10:11:52.940' AS DateTime), 549.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (21, 6, 9, CAST(N'2020-11-16T10:13:28.443' AS DateTime), 200.0000, N'da nang', N'0366412000')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (22, 6, 6, CAST(N'2020-11-16T10:14:33.820' AS DateTime), 800.0000, N'da nang', N'0366412000')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (23, 6, 16, CAST(N'2020-11-16T10:15:21.960' AS DateTime), 70.0000, N'da nang', N'0366412000')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (24, 4, 5, CAST(N'2020-11-16T10:16:45.953' AS DateTime), 600.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (25, 5, 6, CAST(N'2020-11-16T10:17:57.873' AS DateTime), 800.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (26, 4, 8, CAST(N'2020-11-16T10:19:36.550' AS DateTime), 549.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (27, 10, 11, CAST(N'2020-11-16T10:22:00.583' AS DateTime), 299.0000, N'o nha', N'2435351313')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (28, 4, 8, CAST(N'2020-11-16T10:36:05.667' AS DateTime), 1098.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (29, 4, 9, CAST(N'2020-11-16T10:36:43.347' AS DateTime), 200.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (30, 4, 7, CAST(N'2020-11-16T13:19:38.213' AS DateTime), 749.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (31, 4, 6, CAST(N'2020-11-16T13:28:51.510' AS DateTime), 800.0000, N'hanoi', N'0869997926')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (32, 5, 8, CAST(N'2021-02-07T19:39:34.430' AS DateTime), 549.0000, N'hanoi', N'324567467377')
INSERT [dbo].[Order] ([OrderID], [CustomerID], [ProductID], [OrderDate], [TotalMoney], [Address], [PhoneNumber]) VALUES (35, 5, 8, CAST(N'2021-02-07T19:39:34.430' AS DateTime), 549.0000, N'hanoi', N'324567467377')
SET IDENTITY_INSERT [dbo].[Order] OFF

SET IDENTITY_INSERT [dbo].[Product] ON 
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (2, N'Men Shirt Long Sleeve', 1, N'20', 60.0000, 100, 0, N'MenShirtLongSleeve.png', 1, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (3, N'Beach Clothes', 1, N'10', 50.0000, 80, 0, N'coast.png', 1, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (4, N'Women Dress', 1, N'30', 49.9900, 50, 0, N'womendress.png', 2, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (5, N'Gucci Shirt', 2, N'50', 600.0000, 40, 0, N'gucci.png', 1, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (6, N'Gucci Cardigan', 2, N'80', 800.0000, 20, 0, N'gucciharrod.png', 1, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (7, N'Gucci Embroidered', 2, N'80', 749.0000, 25, 0, N'gucciEmbroidered.png', 2, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (8, N'Versace Ilus Sneaker', 3, N'50', 549.0000, 18, 0, N'versaceIlusSneaker.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (9, N'Reversible Dragon Sukajan', 5, N'60', 200.0000, 40, 0, N'reversibleDragonSukajan.png', 6, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (10, N'Gucci Short Dress', 2, N'60', 1726.0000, 10, 0, N'GucciShortDress.png', 2, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (11, N'Jersey Oversize T-Shirt', 2, N'60', 299.0000, 70, 0, N'OversizeTshirtWomen.png', 1, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (12, N'Logo-patch wide-leg jeans', 2, N'50', 449.0000, 65, 0, N'wideLegJeans.png', 2, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (13, N'Gucci slide with Double G ', 2, N'50', 139.0000, 40, 0, N'GucciSlideWomen.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (14, N'Jordan 1 Light Smoke Grey', 4, N'30', 220.0000, 50, 0, N'JordanLightSmokeGrey.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (15, N'Gucci Bee & Stars', 2, N'50', 790.0000, 25, 0, N'GucciBeeStars.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (16, N'Vans Sk8-Hi Cut and Paste ', 6, N'25', 70.0000, 100, 0, N'VansCutnPaste.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (17, N'Nike Air Force 1', 7, N'120', 90.0000, 120, 0, N'airforce1.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (18, N'"To ong" Slide', 8, N'200', 5.0000, 200, 0, N'deptoong.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (19, N'"Bac Ho" Slide', 8, N'300', 10.0000, 300, 0, N'depbacho.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (20, N'Chaco Sandal', 8, N'500', 8.0000, 500, 0, N'chaco.png', 5, N'Something blah blah blah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (21, N'Jordan 4 Red Metallic', 4, N'200', 347.0000, 200, 0, N'jd4redmetallic.png', 5, N'Something')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (22, N'Off-White x WMNS Jordan 4 SP', 4, N'100', 947.0000, 100, 0, N'offwhitejd4.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (23, N'Air Jordan 7 ', 4, N'120', 519.0000, 120, 0, N'jd7.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (24, N'Air Jordan 1 Laser', 4, N'110', 460.0000, 110, 0, N'laserjd1.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (25, N'Vans Old Skool', 6, N'300', 50.0000, 300, 0, N'vansos.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (26, N'Vans x Thrasher Slip-On', 6, N'250', 51.0000, 250, 0, N'vansxthrasherslipon.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (27, N'Shoes', 5, N'20', 400.0000, 20, 0, N'airforce1.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (28, N'Shoes', 5, N'20', 400.0000, 20, 0, N'airforce1.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (29, N'Shoes', 5, N'20', 400.0000, 20, 0, N'airforce1.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (32, N'Shoes', 5, N'20', 400.0000, 20, 0, N'airforce1.png', 5, N'Smt')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (33, N'Air Jordan 23312wqe', 4, N'60', 514.0000, 60, 0, N'diorjdlow.png', 5, N'Shoe for sasadsaq2asd')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (35, N'Air Jordan 1 Dior Low', 4, N'60', 5885.0000, 60, 0, N'diorjdlow.png', 5, N'Shoe for everyone yeah yeah')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (36, N'Air Jordan 1 Dior Low', 4, N'60', 5885.0000, 60, 0, N'airdior.png', 5, N'Something fun')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (37, N'Versace Barocco', 3, N'30', 1195.0000, 30, 0, N'versaceBarocco.png', 1, N'hehe')
INSERT [dbo].[Product] ([ProductID], [ProductName], [SupplierID], [Quantity], [Price], [NumberOfImport], [NumberOfSell], [ImagePath], [CategoryID], [Description]) VALUES (38, N'Air Jordan 1 Gym Red Low', 4, N'10', 250.0000, 10, 0, N'jd1gymred.png', 5, N'Giay cho moi nguoi')
SET IDENTITY_INSERT [dbo].[Product] OFF

INSERT [dbo].[Role] ([RoleID], [RoleName]) VALUES (1, N'admin')
INSERT [dbo].[Role] ([RoleID], [RoleName]) VALUES (2, N'customer')
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 1)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 2)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 3)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 4)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 5)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 4)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 5)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 6)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 7)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 8)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 9)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 10)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 11)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 4)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 5)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 6)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 7)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 8)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 9)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 10)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (2, 11)
INSERT [dbo].[Role_Feature] ([RoleID], [FeatureID]) VALUES (1, 12)

SET IDENTITY_INSERT [dbo].[Supplier] ON 
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (1, N'China Company', N'Anh Tau', N'Trung Quoc', N'Shang Hai', N'215000', N'123456789', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (2, N'Gucci', N'Anh Gucci', N'Italia', N'Italia', N'20121', N'987654321', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (3, N'Versace', N'Anh Versace', N'Italia', N'Italia', N'20162', N'513648523', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (4, N'AIr Jordan', N'Anh Jordan', N'Germany', N'Germany', N'10115', N'532648951', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (5, N'Sukajan', N'Sukajan', N'Japan', N'Japan', N'1000001', N'4654515135', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (6, N'Vans', N'Vans', N'USA', N'USA', N'21201', N'3543515135', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (7, N'Nike', N'Nike', N'USA', N'USA', N'21201', N'6545165165', NULL)
INSERT [dbo].[Supplier] ([SupplierID], [CompanyName], [ContactName], [Address], [City], [PostalCode], [Phone], [HomePage]) VALUES (8, N'Thuong Dinh', N'Thuong Dinh', N'Viet Nam', N'Viet Nam', N'10000', N'135151351', NULL)
SET IDENTITY_INSERT [dbo].[Supplier] OFF

ALTER TABLE [dbo].[Account_Role]  WITH CHECK ADD  CONSTRAINT [FK_Account_Role_Role] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Role] ([RoleID])
GO
ALTER TABLE [dbo].[Account_Role] CHECK CONSTRAINT [FK_Account_Role_Role]
GO

ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Customer1] FOREIGN KEY([CustomerID])
REFERENCES [dbo].[Customer] ([CustomerID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Customer1]
GO

ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [FK_Order_Product] FOREIGN KEY([ProductID])
REFERENCES [dbo].[Product] ([ProductID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [FK_Order_Product]
GO

ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Categories] FOREIGN KEY([CategoryID])
REFERENCES [dbo].[Categories] ([CategoryID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Categories]
GO

ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Supplier] FOREIGN KEY([SupplierID])
REFERENCES [dbo].[Supplier] ([SupplierID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Supplier]
GO

ALTER TABLE [dbo].[Role_Feature]  WITH CHECK ADD  CONSTRAINT [FK_Role_Feature_Feature] FOREIGN KEY([FeatureID])
REFERENCES [dbo].[Feature] ([FeatureID])
GO
ALTER TABLE [dbo].[Role_Feature] CHECK CONSTRAINT [FK_Role_Feature_Feature]
GO

ALTER TABLE [dbo].[Role_Feature]  WITH CHECK ADD  CONSTRAINT [FK_Role_Feature_Role] FOREIGN KEY([RoleID])
REFERENCES [dbo].[Role] ([RoleID])
GO
ALTER TABLE [dbo].[Role_Feature] CHECK CONSTRAINT [FK_Role_Feature_Role]
GO

ALTER TABLE [dbo].[Order]
ADD Quantity int 


select * from Account_Role
select * from [dbo].[Role]
select * from Role_Feature
select * from Feature

select * from BillDetail
select * from [dbo].[Order]
select * from Customer
select * from Product
select * from Categories
select * from Supplier
